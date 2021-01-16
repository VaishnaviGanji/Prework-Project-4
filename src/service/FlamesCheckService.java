package service;

public class FlamesCheckService {
	public char findFlames(String name1, String name2)
	{
		name1 = name1.toLowerCase();
		name2 = name2.toLowerCase();
		StringBuilder sb1 = new StringBuilder(name1);
		StringBuilder sb2 = new StringBuilder(name2);
		char res = '\0';
		int len1 = name1.length(), len2 = name2.length(), i, j, mod;
		for (i = 0; i < len1; i++) {
			for (j = 0; j < len2; j++) {
				if (sb1.charAt(i) == sb2.charAt(j) && sb1.charAt(i) != '0') {
					sb1.replace(i, i + 1, "0");
					sb2.replace(j, j + 1, "0");
				}
			}
		}
		int count = 0;
		for (i = 0; i < len1; i++) {
			if (sb1.charAt(i) != '0') {
				count += 1;
			}
		}
		for (i = 0; i < len2; i++) {
			if (sb2.charAt(i) != '0') {
				count += 1;
			}
		}
		StringBuilder flames = new StringBuilder("flames");
		String temp;
		while (flames.length() > 1) {
			mod = count % flames.length();
			if (mod == 0) {
				temp = flames.substring(0, flames.length() - 1);
			} else {
				temp = flames.substring(0, mod - 1) + flames.substring(mod);
			}
			flames = new StringBuilder(temp);
		}
		res = flames.charAt(0);
		return res;
	}
}
// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

