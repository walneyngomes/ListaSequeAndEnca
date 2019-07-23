
public class ListaSequencial extends Lista {
	private static final int TAM = 30;
	public Object[] lista = new Object[TAM];

	private static int pos = 0;

	@Override
	public boolean listaVazia() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean listaCheia() {
		// TODO Auto-generated method stub

		return pos != this.qntdElementos();
	}

	@Override
	public int qntdElementos() {
		// TODO Auto-generated method stub
		return lista.length;
	}

	@Override
	public int posicaoDe(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void addElemento(Object objeto) {
		// TODO Auto-generated method stub
		if (listaCheia()) {
			lista[pos] = objeto;
			pos++;
		} else {
			System.out.print("Cheia");
		}

	}

	@Override
	public void eliminarPor(int id) {
		lista[id] = null;
		for (int i = 0; i < lista.length; i++) {
			if (id == i) {
				lista[i] = lista[i + 1];
			}
		}

	}

}
