import java.util.HashMap;
import java.lang.reflect.Array;
import java.util.Arrays;

public class HashhMap<k,v> {
	
private static int capacity=16;
private static float loadFactor=0.75f;
private int size=0;
private int maxSize;
Entry[] table;

public HashhMap(){
	maxSize=(int)(capacity*loadFactor);
	table=new Entry<?,?>[maxSize];
	
}

public HashhMap(int capacity){
	
	this.capacity=capacity;
	maxSize=(int)(capacity*loadFactor);
	table=new Entry<?,?>[maxSize];
}
public HashhMap(int capacity,float ld){
	
	this.capacity=capacity;
	this.loadFactor=ld;
	maxSize=(int)(capacity*loadFactor);
	table=new Entry<?,?>[maxSize];
}
	
public v put(k key,v value)
{
	if( value ==null){}
	Entry<?,?> tab[] = table;
	int hash =key.hashCode();
	int index=hash%tab.length;
	System.out.println(tab.length);
	
	for(Entry<k,v> e=table[index]; e!=null;e=e.next){
		if ((hash==e.hash) && key==e.key)
		{
			Entry<k,v> old= e;
			e.value=value;
			
			return old.value;
		}
	}
	return null;
}
	public static void main(String[] args) {
		
		HashhMap<Integer,Integer> h= new HashhMap(32,0.8f);
		h.put(1, 1);
		h.put(1, 1);
		h.put(1, 1);
		h.put(1, 1);
		h.put(1, 1);
		h.put(1, 1);
	}

}
