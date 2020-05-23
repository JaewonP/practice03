package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		// TODO Auto-generated method stub
		String result = new String() ;
		
		for(int i =0 ; i <strArr.length; i++) {
			 result += strArr[i];
			
		}
		return result;
	}

	//문자열을 결합하여 리턴 하는 메소드 구현    
}
