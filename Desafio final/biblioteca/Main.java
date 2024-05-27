import collections.*;

public class Main
{
    public static void main(String[] args)
    {
        Hash<Contact> hash = new Hash<>();
        hash.add(1, new Contact("Don", 14, true));
        hash.add(2, new Contact("Trevis", 25, false));
        hash.add(3, new Contact("Queila", 23, true));
        hash.add(4, new Contact("Alisson", 26, false));
        hash.add(5, new Contact("Raissa", 21, true));

        List<String> dados = hash.stream()
        .filter(p -> p.getIdade() > 17)
        .filter(p -> p.isExApprentice())
        .map(p -> p.getNome())
        .collect();

        for(int i = 0; i < dados.size(); i++)
        {
            System.out.println(dados.get(i));
        }
    }
}