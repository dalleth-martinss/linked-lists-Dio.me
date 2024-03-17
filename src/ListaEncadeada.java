public class ListaEncadeada<T> {
   
  
No<T> referenciaEntrada;
No<T> referenciaFinal;

public ListaEncadeada(){
   this.referenciaEntrada = null;

}
//codigo melhorado 
public void add(T conteudo) {
   No<T> novoNo = new No<>(conteudo);
   
   if (this.isEmpty()) {
       referenciaEntrada = novoNo;
       referenciaFinal = novoNo;
   } else {
       referenciaFinal.setProximoNo(novoNo);
       referenciaFinal = novoNo;
   }
}
public T get (int index){
   return getNo(index).getConteudo();
}
private No<T> getNo(int index) {
   validaIndice(index);

   No<T> noAuxiliar = referenciaEntrada;

   for (int i = 0; i < index; i++) {
       noAuxiliar = noAuxiliar.getProximoNo();
   }
   return noAuxiliar;
}

public T remove(int index) {
   validaIndice(index);

   No<T> noAlvo = this.getNo(index);
   T conteudo = noAlvo.getConteudo();

   if (index == 0) {
       referenciaEntrada = noAlvo.getProximoNo();
   } else {
       No<T> noAnterior = getNo(index - 1);
       noAnterior.setProximoNo(noAlvo.getProximoNo());
   }

   return conteudo;
}

public int size() {
   int tamanhoLista = 0;
   No<T> referenciaAux = referenciaEntrada;

   while (referenciaAux != null) {
       tamanhoLista++;
       referenciaAux = referenciaAux.getProximoNo();
   }

   return tamanhoLista;
}

public void validaIndice(int index){

   if (index >= size()) {
      throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index + " desta lista ");
   }
}

public boolean isEmpty(){
   return referenciaEntrada == null ? true : false;
}

@Override
public String toString() {
   String strRetorno = " ";
   No<T> noAuxiliar = referenciaEntrada;

   for (int i = 0 ; i < this.size(); i++){
      strRetorno += " [No {conteudo = " + noAuxiliar.getConteudo() + "} ---> ";
      noAuxiliar = noAuxiliar.getProximoNo();
      }
      strRetorno += "null";
   return strRetorno;
}


}


// public T remove(int index){
//       No<T> noAlvo = this.getNo(index);
//    if(index == 0){
//       referenciaEntrada = noAlvo.getProximoNo();
//       return noAlvo.getConteudo();
//    }
//    No<T>  noAnterior = getNo(index -1);
//    noAnterior.setProximoNo(noAlvo.getProximoNo());
//    return noAlvo.getConteudo();

// }

// private No<T> getNo(int index){

//    validaIndice(index);

//     No<T> noAuxiliar = referenciaEntrada;
//    No<T> noRetorno = null;

//    for(int i = 0; i < this.size()-1; i++){
//       noRetorno = noAuxiliar;
//       noAuxiliar = noAuxiliar.getProximoNo();
//    }
//    return noRetorno;
// }


// public void add(T conteudo){
//    No<T> novoNo = new No<>(conteudo);
//    if(this.isEmpty()){
//       referenciaEntrada = novoNo;
//    }
//    No<T> noAuxiliar = referenciaEntrada;
//    for (int i = 0; i < this.size() -1; i++){
//        noAuxiliar = noAuxiliar.getProximoNo();
//    }
//    noAuxiliar.setProximoNo(novoNo);
// }

// this method  go return the size of list.
// Este metodo vai retornar o tamanho da lista
//codigo melhorado




// public int size(){

//    int tamanhoLista = 0;
//    No<T> referenciaAux = referenciaEntrada;

//    while(true){
//       if(referenciaAux != null){
//          tamanhoLista++;
//          if(referenciaAux.getProximoNo() != null){
//             referenciaAux = referenciaAux.getProximoNo();
//          }else{
//             break;
//          }
//       }else{
//          break;
//       }
//    }
//    return tamanhoLista;
// }