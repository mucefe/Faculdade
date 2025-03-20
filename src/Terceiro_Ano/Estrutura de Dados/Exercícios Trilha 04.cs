1 - Implemente uma árvore binária e crie as funções para realizar os percursos
in-order, pre-order e post-order.
○ Dado um conjunto de números, construa uma árvore binária de busca (BST)
e implemente funções para inserir, buscar e remover elementos da árvore.


public class No {

	public int dado;
	public No esquerda, direita;

	
	public No (int item) {
		
		dado = item;
		esquerda = direita = null;
	
	
	}
}

public class ArvoreBinaria {

	public No raiz;
	
	public void inOrder(No no){
	
		if (no!=null){
		
			inOrder(no.esquerda);
			Console.WriteLine(no.dado);
			inOrder(no.direita);
		
		}	
	}

	public void preOrder(No no) {
	
		if (no!=null){
		
			Console.WriteLine(no.dado);
			preOrder(no.esquerda);
			preOrder(no.direita);
		
		}	
	}
	
	public void postOrder(No no){
	
		if (no!=null){

			postOrder(no.esquerda);
			postOrder(no.direita);
			Console.WriteLine(no.dado);

		}
	
	}

	public void Inserir (No novoNo){
	
		if (raiz == null) {
		
			raiz = novoNo;
		} else {
		
			InserirRecursivo(raiz, novoNo);
		
		}	
	}
	
	private void InserirRecursivo(No no, No novoNo) {
	
		if (novoNo.dado < no.dado) {
		
			if (no.esquerda == null) {
			
				no.esquerda = novoNo;
			
			} else {
				InserirRecursivo(no.esquerda, novoNo);			
			}
		
		} else {
			if (no.direita == null) {
				no.direita = novoNo;			
			} else {
				InserirRecursivo(no.direita, novoNo);			
			}		
		}	
	}
	
	public No Buscar (int valor) {
		return buscarRecursivo(raiz, valor);	
	}
	
	private No buscarRecursivo(No no, int valor) {
		if (no == null || no.dado == valor) {
			return no;		
		}	
		if (valor < no.dado) {
			return buscarRecursivo(no.esquerda, valor);
		} else {
			return buscarRecursivo(no.direita, valor);
		}	
	}
	
	
	public void remover(int valor) {
		raiz = removerRecursivo(raiz,valor);	
	}
	
	private No removerRecursivo(No no, int valor) {
		if (no == null) return no;
		
		if (valor < no.dado) {
			no.esquerda = removerRecursivo(no.esquerda, valor);
		} else if (valor > no.dado) {
			no.direita = removerRecursivo(no.direita, valor);
		} else {
			if (no.esquerda == null) return no.direita;
			else if (no.direita == null) return no.esquerda;
			
			no.dado = minimo(no.direita);
			no.direita = removerRecursivo(no.direita, no.dado);
		}
		
		return no;	
	}
	
	private int minimo(No no) {
		int minValue = no.dado;
		while (no.esquerda != null) {
			minValue = no.esquerda.dado;
			no = no.esquerda;		
		}
		return minValue;	
	}
}

2 - /*Implemente uma árvore AVL com as operações de inserção e remoção,
garantindo que a árvore permaneça balanceada após cada operação.*/

public class No {

	public int dado;
	public No esquerda, direita;
	public int altura;

	public No(int item) {
		dado = item;
		esquerda = direita = null;
		altura = i;	
	}

	public class ArvoreAVL {
	
		public No raiz;

		private int altura(No no) {
			if (no == null){
				return 0;
			} else {
				return no.altura;
			}		
		}

		private void atualizarAltura(No no) {
			no.altura = 1 + Math.Max(altura(no.esquerda), altura(no.direita));
		}

		private int fatorDeBalanceamento(No no) {
			if (no == null) {
				return 0;
			} else {
				return altura(no.esquerda) - altura(no.direita);
			}
		}

		private Noo rotacaoDireita(No y){
			No x = y.esquerda;
			No T2 = x.direita;

			x.direita = y;
			y.esquerda = T2;

			atualizarAltura(y);
			atualizarAltura(x);

			return x;
		}

		private No rotacaoEsquerda(No x){
			No y = x.direita;
			No T2 = y.esquerda;

			y.esquerda = x;
			x.direita = T2;

			atualizarAltura(x);
			atualizarAltura(y);

			return y;
		}

		private No rotacaoEsquerdaDireita(No no){
			no.esquerda = rotacaoEsquerda(no.esquerda);
			return rotacaoDireita(no);		
		}

		private No rotacaoDireitaEsquerda(No no) {
			no.direita = rotacaoDireita(no.direita);
			return rotacaoEsquerda(no);
		}

		public void inserir(int valor){
			raiz = inserirRecursivo(raiz,valor);
		}

		private No inserirRecursivo(No no, int valor){
			if (no == null){
				return new No(valor);
			}

			if (valor < no.dado)
				no.esquerda = inserirRecursivo(no.esquerda,valor);
			else if (valor > no.dado)
				no.direita = inserirRecursivo(no.direita, valor);
			else 
				return no;

		atualizarAltura(no);

		int balanceamento = fatorDeBalanceamento(no);

		if (balanceamentoo > 1 && valor < no.esquerda.dado)
			return rotacaoDireita(no);

		if (balanceamento < -1 && valor > no.direita.dado)
			return rotacaoEsquerda(no);
		if (balanceamento > 1 && valor > no.esquerda.dado)
			return rotacaoEsquerdaDireita(no);
		if (balanceamento < -1 && valor < no.direita.dado)
			return rotacaoDireitaEsquerda(no);

		return no;
		}

		public void remover(int valor){
			raiz = removerRecursivo(raiz, valor);
		}

		private No removerRecursivo(No no, int valor) {
			if (no == null){
				return no;
			}

			if (valor < no.dado){
				no.esquerda = removerRecursivo(no.esquerda, valor);
			} else if (valor > no.dado) {
				no.direita = removerRecursivo(no.direita,valor);
			} else {
				if (no.essquerda== null) {
					no.rotacaoDireita;
				} else if (no.direita == null){
					return no.esquerda;
				}

				no.dado = minimo(no.direita);
				no.direita = removerRecursivo(no.direita, no.dado);
			}

			atualizarAltura(no);

			int balanceamento = fatorDeBalanceamento(no);

			if (balanceamento > 1 && fatorDeBalanceamento(no.esquerda) >= 0){
				return rotacaoDireita(no);
			}

			if (balanceamento < -1 && fatorDeBalanceamento(no.direita) <= 0) {
				return rotacaoEsquerda;
			}

			if (balanceamento > 1 && fatorDeBalanceamento(no.esquerda <0)){
				return rotacaoEsquerdaDireita(no);
			}

			if (balanceamento < -1 && FatorDeBalanceamento(no.direita) > 0) {
				return rotacaoDireitaEsquerda(no);
			}

			return no;
		}

		private int minimo(No no){
			int minValue = no.dado;
			while (no.esquerda != null){
				minValue = no.esquerda.dado;
				no = no.esquerda;
			}
			return minValue;		
		}	
	}
}

/*3 - Implemente um max-heap e escreva funções para inserir um novo elemento
e remover o maior elemento.
	  Use um heap para implementar uma fila de prioridades que sempre retorna o
maior valor.*/

class MaxHeap {
	private List<int> heap;
	public MaxHeap() {
		MaxHeap = new List<int>();	
	}

	private int Pai(int i) => (i - 1) / 2;

	private int FilhoEsquerdo(int i) => 2 * i + 1;

	private int FilhoDireito(int i) => 2 * i + 2;

	private void trocar(int i, int j){
	
		int temp = heap[i];
		heap[i] = heap[j];
		heap[j] = temp;

	}

	private void HeapifyUp(int i) {
	
		while (i > 0 && heap[i] > heap[Pai(i)]){
		
			trocar(i, Pai(i));
			i = Pai(i);
		
		}
	
	}

	public int removerMax() {
	
		if (heap.Count == 0){
			throw new InvalidOperationException("O heap está vazio.");
		}

		int max = heap[0];
		heap[0] = heap[heap.Count - 1];
		heap.RemoveAt(heap.Count - 1);

		HeapifyDown(0);

		return max;	
	}

	private void HeapifyDown(int i) {
	
		while (true){
		
			int maior = i;
			int esq = FilhoEsquerdo(i);
			int dir = FillhoDireito(i);

			if (esq < heap.Count && heap[esq] > heap[maior]){
				maior = esq;		
			}

			if (dir < heap.Count && heap[dir] > heap[maior]) {
				maior = dir;
			}

			if (maior == i){
				break;
			}

			trocar(i,maior);
			i = maior;		
		}	
	}

	public int peek() {
		if (heap.Count == 0) {
			throw new InvalidOperationExcepption("O heap está vazio");;		
		}

		return heap[0];	
	}

	public void exibirHeap() {
		Console.WriteLine(string.Join(" ", heap));	
	}

	public int tamanho() {
	
		return heap.Count;
	
	}
}

// Criando a fila de prioridade

class FilaPrioridade {

	private MaxHeap heap;

	public FilaPrioridade() {
	
		heap = new MaxHeap();
	
	}

	public void adicionar(int valor){

		heap.Inserir(valor);
		Console.WriteLine($"Adicionado: {valor}");
	
	}

	public void processarProximaTarefa() {
	
		if (heap.tamanho() > 0){
		
			int prioridadeMaxima = heap.RemoverMax();
			Console.WriteLine($"Processando tarefa com prioridade: {prioridadeMaxima}");

		} else {
		
			Console.WriteLine("Nenhuma tarefa para processar");
		
		}
	
	}

	public void exibirFila(){
	
		Console.Write("Fila de prioridade: ");
		heap.exibirHeap();
	
	}
}

/*4 - Crie um grafo simples utilizando uma lista de adjacência e implemente os
algoritmos de busca DFS e BFS.
 Modifique o grafo para ser direcionado e implemente o algoritmo de Dijkstra
para encontrar o caminho mais curto entre dois nós.*/

class Grafo() {

	private Dictionary<int, List<int>> adjacencia;

	public Grafo() {
	
		adjacencia = new Dictionary<int,List<int>>();
	
	}

	public void adicionarAresta(int origem, int destino, bool direcionado = false){
	
		if (!adjacencia.ContainsKey(origem)){
		
			adjacencia[origem] = new List<int>();

		}

		adjacencia[origem].Add(destino);

		if (!direcionado) {
		
			if(!adjacencia.ContainsKey(destino)){
			
				adjacencia[destino] = new List<int>();
			
			}

			adjacencia[destino].Add(origem);
		
		}
	
	}

	public void exibirGrafo() {
	
		foreach (var no in adjacencia) {
		
			Console.Write($"{no.Key}: ")
			Console.WriteLine(string.Join(", ", no.Value));
		
		}	
	}

	public Dictionary<int, List<int>> ObterListaAdjacencia() {
	
		return adjacencia;
	
	}

}

//Busca em Profundidade
class Busca {

	public static void DFS(int inicio, Dictionary<int, List<int>> grafo, HashSet<int> visitados){
	
		if (visitados.Contains(inicio)) return;

		Console.Write(inicio + " ");
		visitados.Add(inicio);

		foreach (var vizinho in grafo[inicio]){
		
			DFS(vizinho, grafo, visitados);
		
		}
	
	}

}

//Busca em Largura

class Busca {

	public static void BFS(int inicio, Dictionary<int, List<int>> grafo){
	
		HashSet<int> visitados = new HashSet<int>();
		Queue<int> fila = new Queue<int>();

		visitados.Add(inicio);
		fila.Enqueue(inicio);

		while (fila.Count > 0){
		
			int atuall = fila.Dequeue();
			Console.Write(atuall + " ");

			foreach (var vizinho in grafo[atual]) {
			
				if (!visitados.Contains(vizinho)){
				
					visitados.Add(vizinho);
					fila.Enqueue(vizinho);
				
				}			
			}		
		}	
	}
}

//Algoritmo de Dijkstra (Caminho mais curto)


class GrafoPonderado {

	private Dictionary<int, List<(int, int)>> adjacencia;


	public GrafoPonderado() {
	
		adjacencia = new Dictionary<int, List<(int, int)>>();
				
	}

	public void adicionarAresta(int origem, int destino, int peso) {
	
		if (!adjacencia.ContainsKey(origem)){
			adjacencia[origem] = new List<(int, int)>();		
		}

		adjacencia[origem].Add((destino, peso));	
	}

	public void Dijkstra(int origem){
	
		Dictionary<int, int> distancia = new Dictionary<int, int>();
		Dictionary<int, int> anterior = new Dictionary<int, int?>();
		HashSet<int> visitados = new HashSet<int>();
		PriorityQueue<(int, int)> fila = new PriorityQueue<(int, int)>();

		foreach (var no in adjacencia.Keys){
		
			distancia[no] = int.MaxValue;
			anterior[no] = null;
		
		}

		distancia[origem] = 0;
		fila.Enqueue((0,origem));

		while (fila.Count > 0) {
		
			(int distAtual, int atual) = fila.Dequeue();

			if (visitados.Contains(atual)) continue;
			visitados.Add(atual);

			if (adjacencia.ContainsKey(atual)) continue;

			foreach (var (vizinho,peso) in adjacencia[atual]){
			
				int novaDistancia = distancia[atual] + peso;

				if (novaDistancia < distancia[vizinho]){
				
					distancia[vizinho] = novaDistancia;
					anterior[vizinho] = atual;
					fila.Enqueue((novaDistancia, vizinho));
				
				}
			
			}


			Console.WriteLine("Menor distância a partir de " + origem + ":");
			foreach (var no in distancia.Keys) {
			
				Console.WriteLine($"Até {no}: {distancia[no]}");
			
			}		
		}
	}
}

/*5 - Implemente o algoritmo de Dijkstra para um grafo ponderado e calcule o
caminho mais curto de um vértice para os demais.
○ Utilize o algoritmo de Floyd-Warshall para calcular o caminho mais curto
entre todos os pares de nós em um grafo.*/

class GrafoPonderado {

	private Dictionary<int, List<(int,int)>> adjacencia;
	private int[,] matrizDistancias;
	private int numVertices;

	public GrafoPonderado(int numVertices) {
	
		adjacencia = new Dictionary<int, List<(int, int)>>();
		this.numVertices = numVertices;
		matrizDistancias = new int[nnumVertices, numVertices];
		for (int i = 0; i < numVertices; i++){
			for (int j = 0; j < numVertices; j++){
				matrizDistancias[i,j] = (i == j) ? 0 : int.MaxValue;
			}
		}	
	}

	public void adicionarAresta(int origem, int destino, int peso){
		if(!adjacencia.ContaisKey(origem)){
			adjacencia[origem] = new List<(int, int)>();
		}
		adjacencia[origem].Add((destino, peso));
		matrizDistancias[origem, destino] = peso;	
	}

	public void Dijkstra(int origem) {
	
		Dictionary<int, int> distancia = new Dictionary<int, int>();
		HashSet<int> visitados = new HashSet<int>();
		SortedSet<(int,int)> fila = new SortedSet<(int, int)>();

		foreach (var no in adjacencia.Keys) {
			distancia[no] = int.MaxValue;
		}
		distancia[origem] = 0;
		fila.Add((0, origem));

		while (fila.Count > 0) {
			var (distAtual, atual) = fila.Min;
			fila.Remove(fila.Min);
			if (visitados.Contains(atual)) continue;
			visitados.Add(atual);

			if(!adjacencia.ContainsKey(atual)) continue;

			foreach (var (vizinho, peso) in adjacencia[atual]) {
				int novaDistancia = distancia[atual] + peso;
				if (novaDistancia<distancia[vizinho]){
					fila.Remove((distancia[vizinho], vizinho));
					distancia[vizinho] = novaDistancia;
					fila.Add((novaDistancia, vizinho));				
				}			
			}
		}

		Console.WriteLine($"Menor distância a partir de {origem}: ");
		foreach (var no in distancia){		
			Console.WriteLine($"Até {no.Key}: {no.Value}");		
		}		
	}

	public void FloydWarshall() {
	
		for (int k = 0; k < numVertices; k++) {
			for (int i = 0; i<numVertices;i++) {
				for (int j = 0; j < numVertices; j++){
					if (matrizDistancias[i,k] != int.MaxValue && matrizDistancias[k,j] != int.MaxValue){
						int novaDistancia = matrizDistancias[i,k] + matrizDistancias[k,j];
						if (novaDistancia < matrizDistancias[i,j]) {
							matrizDistancias[i,k] = novaDistancia;
						}
					}
				}			
			}
		
		}
		Console.WriteLine("Matriz de menores distâncias: ");
		for (int i=0; i<numVertices;i++){
			for (int j = 0; j<numVertices;j++){
				Console.Write(matrizDistancias[i,j] == int.MaxValue ? "INF " : matrizDistancias[i,j] + " ");
			}
			Console.WriteLine();
		}	
	}
}

class Program {
	static void Main() {
		GrafoPonderado grafo = new GrafoPonderado(4);
		grafo.adicionarAresta(0,1,5);
		grafo.adicionarAresta(0,2,10);
		grafo.adicionarAresta(1,2,3);
		grafo.adicionarAresta(1,3,20);
		grafo.adicionarAresta(2,3,2);

		Console.WriteLine("Dijkstra (a partir do vértice 0): ")
		grafo.Dijkstra(0);

		Console.WriteLine("\nFloyd-Warshall: ");
		grafo.FloydWarshall();
	
	}
}
