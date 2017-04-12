package com.coderising.jvm.method;

import com.coderising.jvm.attr.CodeAttr;
import com.coderising.jvm.clz.ClassFile;

public class Method {
	private int accessFlag;
	private int nameIndex;
	private int descriptorIndex;
	
	private CodeAttr codeAttr;
	
	private ClassFile clzFile;
	/*
	 * getter setter
	 */
	public int getAccessFlag() {
		return accessFlag;
	}
	public void setAccessFlag(int accessFlag) {
		this.accessFlag = accessFlag;
	}
	public int getNameIndex() {
		return nameIndex;
	}
	public void setNameIndex(int nameIndex) {
		this.nameIndex = nameIndex;
	}
	public int getDescriptorIndex() {
		return descriptorIndex;
	}
	public void setDescriptorIndex(int descriptorIndex) {
		this.descriptorIndex = descriptorIndex;
	}
	public CodeAttr getCodeAttr() {
		return codeAttr;
	}
	public void setCodeAttr(CodeAttr codeAttr) {
		this.codeAttr = codeAttr;
	}
	public ClassFile getClzFile() {
		return clzFile;
	}
	
}
