/**
 * Classe que implementa uma lista linear usando arranjo.
 * 
 * @author Bruno Neves
 */

public class ListArrayOfInteger {
    // Atributos
    private static final int INITIAL_SIZE = 10;
    private Integer[] data;
    private int count;

    /**
     * Construtor da lista.
     */
    public ListArrayOfInteger() {
        this(INITIAL_SIZE);
    }

    public void reorganizeList() {
        for (int i = 0; i < size(); i++) {
            if(i == size()){
                data[i] = data[i + 1];
            }
        }
    }

    public void reorganizeListInPosition(int last) {
        for (int i = last; i < size(); i++) {
            data[i] = data[i + 1];
        }
        count--;
    }

    /**
     * Adiciona um elemento ao final da lista.
     * 
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        if (count == data.length) {
            setCapacity(data.length * 2);
        }
        data[count] = element;
        count++;
    }

    public int indexOf(Integer element) {
        int result = 0;
        for (int i = 0; i < size(); i++) {
            if (data[i] == element) {
                result = i;
            }
        }
        return result;
    }

    public void reverse() {
        int n = size();
        for (int i = 0; i < n / 2; i++) {
            int aux = data[i];
            data[i] = data[n - 1 - i];
            data[n - 1 - i] = aux;
        }
    }

    public int countOccurences(int element) {
        int result = 0;
        for (int i = 0; i < size(); i++) {
            if (data[i] == element) {
                result++;
            }
        }
        return result;
    }

    /**
     * Retorna o numero de elementos armazenados na lista.
     * 
     * @return o numero de elementos da lista
     */
    public int size() {
        return count;
    }

    /**
     * Retorna o elemento de uma determinada posicao da lista.
     * 
     * @param index a posicao da lista
     * @return o elemento da posicao especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public int get(int index) { // O(1)
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        return data[index];
    }

    public Integer removeByIndex(int position) {
        Integer result = 0;
        for (int i = 0; i < size(); i++) {
            if (i == position) {
                result = data[i];
                data[i] = null;
                reorganizeListInPosition(position);
            }
        }
        return result;
    }

    public boolean contains(Integer element) {
        boolean flag = false;
        for (int i = 0; i < size(); i++) {
            if (data[i] == element) {
                flag = true;
            }
        }
        return flag;
    }

    public boolean remove(Integer element) {
        boolean flag = false;
        if (size() > 0) {
            data[element] = null;
            reorganizeList();
        }
        return flag;
    }

    /**
     * Esvazia a lista.
     */
    public void clear() {
        data = new Integer[INITIAL_SIZE];
        count = 0;
    }

    public void addOnPosition(int position, Integer element) {
        if (position < 0 || position > size()) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        Integer[] newData = new Integer[size() + 1];
        for (int i = 0; i < position; i++) {
            newData[i] = data[i];
        }
        newData[position] = element;
        for (int i = position; i < size(); i++) {
            newData[i + 1] = data[i];
        }
        data = newData;
    }

    public int set(int position, Integer element) {
        int value = data[position];
        data[position] = element;
        return value;
    }

    /**
     * 
     * Construtor da lista.
     * 
     * @param tam tamanho inicial a ser alocado para data[]
     */
    public ListArrayOfInteger(int tam) {
        if (tam <= 0) {
            tam = INITIAL_SIZE;
        }
        data = new Integer[tam];
        count = 0;
    }

    /**
     * Retorna true se a lista nao contem elementos.
     * 
     * @return true se a lista nao contem elementos
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(data[i]);
            if (i != (count - 1)) {
                s.append(",");
            }
        }
        s.append("\n");
        return s.toString();
    }

    private void setCapacity(int newCapacity) {
        if (newCapacity != data.length) {
            int min = 0;
            Integer[] newData = new Integer[newCapacity];
            if (data.length < newCapacity) {
                min = data.length;
            } else {
                min = newCapacity;
            }
            for (int i = 0; i < min; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }
}