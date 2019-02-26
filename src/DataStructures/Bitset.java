package DataStructures;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bitset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int lenghth = sc.nextInt();
		BitSet bSA = new BitSet(lenghth);
		BitSet bSB = new BitSet(lenghth);
		int ops = sc.nextInt();
		for(int i=0;i<ops;i++) {
			String op = sc.next();
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(op.equalsIgnoreCase("AND")) {
				if(a == 1)
					bSA.and(bSB);
				else
					bSB.and(bSA);
			}else if(op.equalsIgnoreCase("OR")) {
				if(a == 1)
					bSA.or(bSB);
				else
					bSB.or(bSA);
			}else if(op.equalsIgnoreCase("SET")) {
				if(a == 1)
					bSA.set(b);
				else
					bSB.set(b);
			}else if(op.equalsIgnoreCase("XOR")) {
				if(a == 1)
					bSA.xor(bSB);
				else
					bSB.xor(bSA);
			}else if(op.equalsIgnoreCase("FLIP")){
				if(a == 1)
					bSA.flip(b);
				else
					bSB.flip(b);
			}
			System.out.println(bSA.cardinality() + " " + bSB.cardinality());
		}
		sc.close();
	}
}
/*Scanner sc = new Scanner(System.in);
int setSize = sc.nextInt();
int noOps = sc.nextInt();
BitSet[] bitSets = new BitSet[]{new BitSet(setSize), new BitSet(setSize)};
Map<String, BiConsumer<Integer,Integer>> ops = new HashMap<>();
ops.put("AND", (index1, index2) -> bitSets[index1-1].and(bitSets[index2-1]));
ops.put("OR", (index1, index2) -> bitSets[index1-1].or(bitSets[index2-1]));
ops.put("XOR", (index1, index2) -> bitSets[index1-1].xor(bitSets[index2-1]));
ops.put("SET", (index1, index2) -> bitSets[index1-1].set(index2));
ops.put("FLIP", (index1, index2) -> bitSets[index1-1].flip(index2));
for (int i = 0; i < noOps; i++){
    ops.get(sc.next()).accept(sc.nextInt(), sc.nextInt());    
    System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
}*/
