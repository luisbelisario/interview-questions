public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {

        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        // nesse problem eu so preciso retornar o comprimento do array sem duplicatas
        // uso duas variaveis de controle
        int i = 0;
        // sendo que o i sera o zeresimo elemento do array e servira para controle do array ficticio final que tera o length retornado
        // e j sendo o primeiro elemento do array
        for(int j = 1; j< nums.length; j++) {
            if(nums[i] != nums[j]) {
                // se nums no indice i for diferente de nums no indice j, ou seja do elemento seguinte
                i++;
                nums[i] = nums[j];
                // entao vou para o proximo indice do array final
                // e coloco o numero do array na posicao i igual ao numero da posicao j
                // ou seja, vou avançando no array
            }
        }
        System.out.println("Comprimento do array final " + (i + 1));
        // é i + 1 porque estou somando ao primeiro elemento que nao foi adicionado inicialmente
    }
}
