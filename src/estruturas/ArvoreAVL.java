package estruturas;

public class ArvoreAVL extends ArvoreBinaria {

    public ArvoreAVL() {
        super();
    }

    @Override
    public void inserir(int valor) {
        this.raiz = inserirAVL(this.raiz, valor);
    }

    private No inserirAVL(No no, int valor) {

        if (no == null) {
            return new No(valor);
        }

        if (valor < no.valor) {
            no.esquerda = inserirAVL(no.esquerda, valor);
        } else if (valor > no.valor) {
            no.direita = inserirAVL(no.direita, valor);
        } else {
            return no;
        }

        no.altura = 1 + Math.max(getAltura(no.esquerda), getAltura(no.direita));

        int balanceamento = getFatorBalanceamento(no);


        if (balanceamento > 1 && valor < no.esquerda.valor) {
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && valor > no.direita.valor) {
            return rotacaoEsquerda(no);
        }

        if (balanceamento > 1 && valor > no.esquerda.valor) {
            no.esquerda = rotacaoEsquerda(no.esquerda);
            return rotacaoDireita(no);
        }

        if (balanceamento < -1 && valor < no.direita.valor) {
            no.direita = rotacaoDireita(no.direita);
            return rotacaoEsquerda(no);
        }

        return no;
    }

    private int getAltura(No no) {
        if (no == null) {
            return 0;
        }
        return no.altura;
    }

    private int getFatorBalanceamento(No no) {
        if (no == null) {
            return 0;
        }
        return getAltura(no.esquerda) - getAltura(no.direita);
    }

    private No rotacaoDireita(No y) {
        No x = y.esquerda;
        No T2 = x.direita;

        x.direita = y;
        y.esquerda = T2;

        y.altura = Math.max(getAltura(y.esquerda), getAltura(y.direita)) + 1;
        x.altura = Math.max(getAltura(x.esquerda), getAltura(x.direita)) + 1;

        return x;
    }

    private No rotacaoEsquerda(No x) {
        No y = x.direita;
        No T2 = y.esquerda;

        y.esquerda = x;
        x.direita = T2;

        x.altura = Math.max(getAltura(x.esquerda), getAltura(x.direita)) + 1;
        y.altura = Math.max(getAltura(y.esquerda), getAltura(y.direita)) + 1;

        return y;
    }
}