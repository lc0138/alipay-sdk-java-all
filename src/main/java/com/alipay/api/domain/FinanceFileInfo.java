package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区块链金融业务的上传文件信息
 *
 * @author auto create
 * @since 1.0, 2019-12-16 15:15:41
 */
public class FinanceFileInfo extends AlipayObject {

	private static final long serialVersionUID = 4456739592647396482L;

	/**
	 * 上传文件生成的唯一id
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 用于路由文件路径的key
	 */
	@ApiField("file_key")
	private String fileKey;

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getFileKey() {
		return this.fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}

}
