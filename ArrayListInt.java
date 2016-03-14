

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
        boolean contains = true;
        //nueva lista creada
        int[] newList = new int[collection.length + 1];
        //Copiamos de la lista antigua a la nueva
        for (int index = 0; index < collection.length && !contains; index++ )
        {
            newList[index] = collection[index];
            if (collection[index] ==  element)//Si la coleccion contiene ese elemento
            {
                contains = false;
            }
        }
        
        //Metemos el elemento nuevo en la lista nueva
        newList[collection.length] = element;

        //Guardamos la lista nueva
        collection = newList;
        
        return contains ;

    }
    
    /**
     * Metodo que vacia la coleccion
     */
    public void clear()
    {
        collection = new int[0];
    }
    /**
     * Metodo que devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        return collection.length==0;
    }
    /**
     * Metodo que devuelve true si la colección contiene ese elemento.
     */
    public boolean contains(int  element)
    { boolean contains = false;
        //Recorremos en busca del elemento
        for (int index = 0; index < collection.length && !contains; index++ )
        {
            if (collection[index] ==  element)//Si la coleccion contiene ese elemento
            {
                contains = true;
            }
        }
        return contains;
    }

}