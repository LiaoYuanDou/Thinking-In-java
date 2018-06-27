package cn.xx.study.java18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class FormattedMemoryInput {

	public static void main(String[] args) throws IOException {

		try {
			DataInputStream in = new DataInputStream(new ByteArrayInputStream(
					BufferedInputFile.read("src/cn/xx/study/java18/FormattedMemoryInput.java").getBytes()));
			while (true)
				System.out.print((char) in.readByte());
		} catch (Exception e) {
			System.err.println("End of stream");
		}
	}

}
