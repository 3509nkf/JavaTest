package com.sample;
import ramdasample.Main;

public class Factory {
//	public static Sample create() {//Sampleインタフェースをimplementsしたななしのクラスを定義しインスタンスを生成しSample型で戻す。
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
