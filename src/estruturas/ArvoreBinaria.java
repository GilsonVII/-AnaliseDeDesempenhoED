package estruturas;

public class ArvoreBinaria {
    protected No raiz;

    public ArvoreBinaria() {
        this.raiz = null;
    }

    public void inserir(int valor) {
        this.raiz = inserirRecursivo(this.raiz, valor);
    }

    private No inserirRecursivo(No atual, int valor) {
        if (atual == null) {
            return new No(valor);
        }
        if (valor < atual.valor) {
            atual.esquerda = inserirRecursivo(atual.esquerda, valor);
        }
        else if (valor > atual.valor) {
            atual.direita = inserirRecursivo(atual.direita, valor);
        }
        
        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRecursivo(this.raiz, valor);
    }

    private boolean buscarRecursivo(No atual, int valor) {
        if (atual == null) {
            return false;
        }

        if (valor == atual.valor) {
            return true;
        }

        if (valor < atual.valor) {
            return buscarRecursivo(atual.esquerda, valor);
        } else {
            return buscarRecursivo(atual.direita, valor);
        }
    }
    
    public void imprimirInOrder() {
        System.out.print("[");
        imprimirRecursivo(this.raiz);
        System.out.println("]");
    }

    private void imprimirRecursivo(No node) {
        if (node != null) {
            imprimirRecursivo(node.esquerda);
            System.out.print(node.valor + " ");
            imprimirRecursivo(node.direita);
        }
    }
}