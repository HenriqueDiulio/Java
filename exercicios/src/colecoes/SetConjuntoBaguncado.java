package colecoes;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashPrintServiceAttributeSet;

public class SetConjuntoBaguncado {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();

		// por o set nao aceitar tipos primitivos ele vai converter
		conjunto.add(1.2); // double > Double
		conjunto.add(true); // boolean > Boolean
		conjunto.add("Teste"); // String
		conjunto.add(2); // int > Interger
		conjunto.add('x'); // char > Caractare

		// para saber o tamanho
		System.out.println("Tamanho é :" + conjunto.size());

		// para remover um item
		System.out.println(conjunto.remove(2));

		// para saber se exite um valor
		System.out.println(conjunto.contains('x'));

		System.out.println("========NOVO CONJUNTO========");

		Set nums = new HashSet();

		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);

		// União entre dois conjuntos
		conjunto.addAll(nums);

		System.out.println(conjunto);

		conjunto.clear();

	}
}
