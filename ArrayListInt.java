

/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    private int[] collection;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {   
        collection = new int [0]; // Se inicializa con 0 elementos para ahorrar espacio.
    }

    /**
     * Metodo añade un elemento a la colección al final de la misma.
     */
    public boolean add (int element)
    {
        boolean contains = false;
        //nueva lista creada
        int[] newList = new int[collection.length + 1];
        //Copiamos de la lista antigua a la nueva
        for (int index = 0; index < collection.length && !contains; index++ )
        {
            newList[index] = collection[index];
            if (collection[index] ==  element)//Si la coleccion contiene ese elemento
            {
                contains = true;
            }
        }
        
        //Metemos el elemento nuevo en la lista nueva
        newList[collection.length] = element;

        //Guardamos la lista nueva
        collection = newList;
        
        return contains ;

    }

   
}