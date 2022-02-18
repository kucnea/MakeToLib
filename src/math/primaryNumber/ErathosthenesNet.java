package math.primaryNumber;

public class ErathosthenesNet {
	
	
	// 2���� max�������� �Ҽ� ( list[index]�� false�϶� index�� �Ҽ� )
	public boolean[] getlist(int max) {
	
		boolean[] list = new boolean[max+1];
		list[0] = list[1] = true;
		
		for(int i = 2 ; i < Math.sqrt(max); i++) {
			if(list[i]==false) {
				for(int j = i*i ; j < max ; j+=i) {
					list[j] = true;
				}
			}
		}
		
		return list;
	}
	
}
