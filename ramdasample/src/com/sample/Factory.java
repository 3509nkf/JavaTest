package com.sample;
import ramdasample.Main;

public class Factory {
//	public static Sample create() {//Sample�C���^�t�F�[�X��implements�����ȂȂ��̃N���X���`���C���X�^���X�𐶐���Sample�^�Ŗ߂��B
//		return new Sample() {
//			@Override
//			public void execute() {
//				System.out.println("test");
//			}
//		};
//	}
	
	public static Sample create() {
		Sample sample = () -> {
			System.out.println("lambda");
		};
		return sample;
	}
	
	
}
