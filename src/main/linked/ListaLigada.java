package linked;

import list.EstruturaElementar;

public class ListaLigada implements EstruturaElementar{

    private No _cabeca;

    public ListaLigada() {
        _cabeca = null;
    }

    @Override
    public boolean buscaElemento(int valor) {
        return (buscaIndice(valor) > -1);
    }

    @Override
    public int buscaIndice(int valor) {
        if (_cabeca == null) {
            return -1;
        }
        int posicao = 0;
        for (No atual = _cabeca; atual != null; atual = atual.getProximo()) {
            if (atual.getValor() == valor) {
                return posicao;
            }
            posicao += 1;
        }
        return -1;
    }

    @Override
    public int minimo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'minimo'");
    }

    @Override
    public int maximo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximo'");
    }

    @Override
    public int predecessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'predecessor'");
    }

    @Override
    public int sucessor(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sucessor'");
    }

    @Override
    public void insereElemento(int valor) {
        No novo = new No(valor);
        if (_cabeca == null) {
            _cabeca = novo;
        } else {
            No atual = _cabeca;
            _cabeca = new No(valor);
            _cabeca.setProximo(atual);
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insereElementoPosicao'");
    }

    @Override
    public void insereInicio(int valor) {
        insereElemento(valor);
    }

    @Override
    public void insereFim(int valor) {
        No novo = new No(valor);
        if (_cabeca == null) {
            _cabeca = novo;
        } else {
            for (No atual = _cabeca; atual != null; atual = atual.getProximo()){
                if (atual.getProximo() == null){
                    atual.setProximo(novo);
                }
            }
        }
    }

    @Override
    public void remove(int valor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void removeIndice(int indice) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeIndice'");
    }

    @Override
    public void removeInicio() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeInicio'");
    }

    @Override
    public void removeFim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFim'");
    }
    
}
