package homework_5.task_2;

// код надо отформатировать
// я бы рекомендовал добавить метод main для проверки
public class Warehouse {
  private Integer jawerly [];
  private Integer index;

   public Warehouse(Integer[] jawerly) {
      this.jawerly = jawerly; // вот здесь проблема, при помощи метода getArray() я могу получить массив и присвоить новое значение любой ячейке
      index= jawerly.length-1;
   }

   public Warehouse(Integer index) {
      this.index = index;
   }

   public Integer next(){
      index=(index+1)% jawerly.length;
      return jawerly[index];
   }

   public Integer [] getArray(){
      return jawerly;
   }

   @Override
   public String toString() {
      return super.toString();
   }
}
