import java.util.List;

import org.junit.Test;

import java.io.IOException;

public class XxxDataLoaderTest {
	
	@Test
	public void testLoad() {
		JavaTest1 loader = new JavaTest1();
		
		//protected�̃t�B�[���h�⃁�\�b�h�ɑ΂��ẮA
		//���t���N�V�����Ȃǂ�p�����ɒl�̏㏑���⏈���̌Ăяo���������Ȃ���
		loader.fileName = "sample.txt";
		List<String> result;
		try {
			result = loader.load();
		} catch (IOException e) {
			
		}
   }
}
