package lec06_01_java_casting;

public class MyInfoTest {

	public static void main(String[] args) {		
		MyInfo myInfo = new MyInfo();
		// parameterized Constructor Initialized below
		// you will not use it for coding, just extra information
		// In Constructor, the system can't recognize byte and short type, so we need to do casting for that
		MyInfo tofael = new MyInfo("Tofael", (byte)65, (short)20000, 743673664, 8768273687462l, 1.7003f, 3.768365, 'M', true);
	}

}
