package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No cabeca;

    public ListaLigada() {
        cabeca = null;
    }

    @Override
    public boolean buscaElemento(int valor){
    if (cabeca == null){
        return false;
    }
    No cabeca = this.cabeca;
    while(cabeca != null){
        if(cabeca.getValor() == valor){
            return true;
        }
        cabeca = cabeca.getProximo();
    }
    return false;
    }

    @Override
    public int buscaIndice(int valor){
        if (cabeca == null){
            return -1;
        } 
        int contador = 0;
        for (No index = cabeca; index != null; index = index.getProximo()) {
            if (contador == valor){
                return index.getValor();
            }
            contador++;
        }
        return -1;
    }

    @Override
    public int minimo() {return 1;
    }

    @Override
    public int maximo() {return 1;
    }

    @Override
    public int predecessor(int valor) {return 1;
    }

    @Override
    public int sucessor(int valor) {return 1;
    }

    @Override
    public void insereElemento(int valor) {
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {

        }

    @Override
    public void insereInicio(int valor) {
        if (this.cabeca == null){
        this.cabeca = new No(valor);
        }else{
            No n = new No(valor);
            n.setProximo(this.cabeca);
            this.cabeca = n;
        }
    }

    @Override
    public void insereFim(int valor) {

        

    }

    @Override
    public void remove(int valor) {
    }

    @Override
    public void removeIndice(int indice) {
    }

    @Override
    public void removeInicio() {
    }

    @Override
    public void removeFim() {
    }
    
}
