//Works both with get/set methods and with constructor initialization
//===================================================================

public class JsonCreator {
	private String name;
	private String secondName;
	private int age;
	
	public JsonCreator( String name, String secondName, int age){
		this.name = name;
		this.secondName = secondName;
		this.age = age;
	}

	
/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	
public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}*/
	

public static void main(String[] args) {
	
        JsonCreator user = new JsonCreator("Volodya", "Pchelnuk", 33);
       /* user.setName("Volodya");
        user.setSecondName("Pchelnik");
        user.setAge(33);*/
	
	String [] key = new String []{"name", "secondName", "age"};
	String [] value = new String [] {user.name, user.secondName, Integer.toString(user.age)};
	//String [] value = new String []{user.getName(), user.getSecondName(), Integer.toString(user.getAge())};
	System.out.println(createJSON(key, value));
        
    }

	
	public static String createJSON(String [] key, String [] value){
		
		String jsonToString = "{";
		for(int i = 0; i < key.length; i++){
			if(i > 0){
				jsonToString += ", ";
			}
			jsonToString += "\"" + key[i] + "\" : \""  + value[i] +"\"";
		}
		jsonToString += "}";
		
		
		
		return jsonToString;
		 
		
	}
   
}

