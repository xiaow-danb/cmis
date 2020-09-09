package com.wander.cmis.commons;

import com.wondersgroup.wssip.framework.exception.BusinessException;
import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * 数字签名工具类
 *
 * @author feng
 */
public class MsgSignatureUtils {
	/**
	 * 签名算法
	 */
	private final static String SIGN_ALGORITHMS = "SHA1WithRSA";
	/**
	 * 字符串编码
	 */
	private final static String STRING_ENCODE = "utf-8";

	/**
	 * 对原文进行数据签名
	 * <p>
	 * 对原文转成utf-8编码后使用sha1计算散列码，对散列码进行asn1编码后使用rsa私钥进行加密，
	 * 对加密结算使用base64把二进制转成字符串
	 * </p>
	 *
	 * @param privkey 私钥
	 * @param content 原文
	 * @return
	 */
	public static String signByPrivateKeyWithSha1Rsa(String privkey, String content) {
		String signstr = null;
		try {
			//根据二进制数据数据的私钥，产生私钥对象
			KeyFactory keyFactory = null;
			keyFactory = KeyFactory.getInstance("RSA");
			PKCS8EncodedKeySpec priPKCS8 = new PKCS8EncodedKeySpec(Base64.decodeBase64(privkey));
			PrivateKey pkey = keyFactory.generatePrivate(priPKCS8);
			//求散列码后使用私钥签名
			Signature sig = Signature.getInstance(SIGN_ALGORITHMS);
			sig.initSign(pkey);
			sig.update(content.getBytes(STRING_ENCODE));
			byte[] signbytes = sig.sign();
			signstr = Base64.encodeBase64String(signbytes);

		} catch (InvalidKeyException | NoSuchAlgorithmException
				| InvalidKeySpecException | SignatureException
				| UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			throw new BusinessException("数字签名错误！", e);
		}

		return signstr;
	}

	/**
	 * 使用公钥进行签名的验证
	 *
	 * @param pubkey    公钥
	 * @param content   原文
	 * @param signature 原来的签名 对二进制的签名进行base64编码
	 * @return
	 */
	public static boolean signVerifyByPublicKeyWithSha1RSA(String pubkey, String content, String signature) {
		boolean bverify = false;
		try {
			//根据二进制数据的公钥构建公钥对象
			KeyFactory keyFactory = KeyFactory.getInstance("RSA");
			PublicKey pubKey = keyFactory.generatePublic(new X509EncodedKeySpec(Base64.decodeBase64(pubkey)));
			Signature sign = Signature.getInstance(SIGN_ALGORITHMS);
			sign.initVerify(pubKey);
			sign.update(content.getBytes(STRING_ENCODE));
			bverify = sign.verify(Base64.decodeBase64(signature));
		} catch (NoSuchAlgorithmException | InvalidKeySpecException
				| UnsupportedEncodingException | InvalidKeyException | SignatureException e) {
			// TODO Auto-generated catch block
			throw new BusinessException("签名验证错误！", e);
		}
		return bverify;
	}

	/**
	 * 得到签名原文
	 * <p>
	 * 签名原文由服务名称，交易名称，请求时间，消息体顺序拼接而成
	 * </p>
	 *
	 * @return
	 */
	public static String getSignatureString(String sname, String tname, String reqtime, String msg) {
		StringBuilder sb = new StringBuilder();
		sb.append(sname)
				.append(tname)
				.append(reqtime)
				.append(msg);
		return sb.toString();
	}
}
