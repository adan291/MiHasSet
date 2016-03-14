

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
    
    /**
     * Metodo que  elimina de la colección el elemento que ocupa la posición especificada y
     * devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public int remove(int index)
    {
        int num = -1;
        int[] newList = new int[collection.length - 1]; 
        if(index < collection.length && index >= 0)
        {
            //Guardamos los elementos en las posiciones indicadas a las anteriores
            for (int i = 0;   i != index; i++ )
            {
                newList[i] = collection[i]; 
            }

            //guardamos el elemento que se borra pero no lo añadimos a la nueva lista

            num = collection[index];

            //Metemos el nuevo elemento despues de la posicion indicada
            for (int i = index+1; i < collection.length;  i++ )
            {
                newList[i-1] = collection[i];
            }

            //Guardamos la lista nueva
            collection = newList;

        }

        return num;
    }
    
    /**
     * devuelve una cadena conteniendo todos los elementos del conjunto separados por comas 
     * y entre corchetes.
     */
    public String toString()
    {
        String cadena = "";
        for(int i=0; i<collection.length;i++)
        {
            cadena = "[" + cadena + collection[i] +"]" + ",";
        }

        return cadena;
    }
    
    /**
     * Metodo que devuelve el número de elementos de la colección.
     */
    public int size()
    {
        return collection.length;
    }
    
    
    /**
     * Metodo que devuelve verdadero si el parámetro es igual al conjunto sobre el que se invoca y falso 
     * en otro caso.
     */
    public boolean equals(MiHashSet otroConjunto)
    {
        boolean exist = false;

        return exist;
    }
}