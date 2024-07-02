/**
 * HW4:Дана строка sql-запроса: "select * from students where"
Сформируйте часть WHERE этого запроса, используя StringBuilder. 
Данные (параметры) для фильтрации приведены в виде json-строки в примере ниже. 
Если значение null, то параметр не должен попадать в запрос.

 *  Метод принимает на вход 2 параметра :
 * String QUERY - начало SQL-запроса; String PARAMS - JSON с параметрами
 * 
 * Пример: Строка sql-запроса:   "select * from students where" 
   Параметры для фильтрации:     {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
   Результат:        select * from students where name='Ivanov' and country='Russia' and city='Moscow'
 */
public class HW4 {

    public static void main(String[] args) {
        String QUERY = "select * from students where";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
// МОЕ РЕШЕНИЕ:
        
// убираем \" из PARAMS       
        String params_replace = PARAMS.replaceAll("\"", "");
// Меняем : на = в PARAMS        
        String param_replace2 = params_replace.replaceAll(":", ",");
// убираем {} из PARAMS
        String param_replace3 = param_replace2.substring(1, param_replace2.length() - 1);
// убираем пробелы из PARAMS
        String param_replace4 = param_replace3.replaceAll(" ", "");
// собираем нужный StringBulder
        String[] arrayPARAMS = param_replace4.split(",");
        StringBuilder PARAM_RES = new StringBuilder();
        for (int i = 0; i < arrayPARAMS.length; i++) {
            if (i % 2 == 0) {
                PARAM_RES.append(arrayPARAMS[i] + "=");
            } else{
                PARAM_RES.append("'" + arrayPARAMS[i] + "'" + " " + "and" + " ");
            }
        }
// Удаляем null значения
        PARAM_RES.delete(52, PARAM_RES.length());
        String Param = PARAM_RES.toString();
// собираем финальную строку через стринг билдер
        StringBuilder Result = new StringBuilder();
        Result.append(QUERY + " "); // Добавляю пробел, чтобы отделить Строки (В Автотестах это не нужно)
        Result.append(Param);

// Печать Моего Решения
        System.out.println(Result);
// Печать Решения Преподавателя
        System.out.println(answer(QUERY, PARAMS));
    }

// РЕШЕНИЕ ПРЕПОДАВАТЕЛЯ:
    public static StringBuilder answer(String QUERY, String PARAMS){
// Меняем {} на ' ' пробелы
      String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
// создаем массив строк по разделителю ","
      String[] params = paramsNew.split(",");
      StringBuilder stringBuilder = new StringBuilder(QUERY);

      for (int i = 0; i < params.length; i++){
// создаем новый массив строк в котором заменяем "" на '' по разделителю ":"
          String[] elements = params[i].replace('"', ' ').split(":");
// если не равно null то добавляем в stringBuilder
          if(!"null".equals(elements[1].trim())){       
            stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
              if (i < params.length - 2) stringBuilder.append(" and ");
          }
      }
      return stringBuilder;
    }
}