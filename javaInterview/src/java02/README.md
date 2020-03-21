### ��5�� Collection���

**13��List**

> 1��ArrayListʹ������ʵ�ֵģ����鱾����������ʵĽṹ��
>> ArrayListΪʲô��ȡ�죿 ��Ϊget(int)����ֱ�Ӵ������ȡ���ݡ�Ϊʲôд������
��ʵ���˵������׼ȷ���������������仯������£���һ���ܿ죬���������ı��ʱ��
��grow(int)���������������ݣ�����Ϊԭ����������1.5���������д��Ч���½���

> 2��LinkedList��˳����ʽṹ����˫����е�Ӧ���еõ�������
> 3��LinkedList��ѯָ�����ݻ�����һЩʱ�䡣��ͷβ����ɾ�����ݵĲ����ǳ�Ѹ�٣�
�������Ҫ������룬��ô������Ҫ��������Ȼ�⻹�Ǳ�ArrayList��System.arraycopy���ܺ�һЩ��
> 4��Vector��ArrayList��ȣ�Vector���̰߳�ȫ�ģ����������������Բ�ͬ������ʵ�ַ���Ч�ʽϵͣ�
���������Ѿ����������Ѿ���ʱ��������
> Stack��Vector�����࣬�ṩ��һЩ��ջ������ط���

**14��Queue**

�ڲ�ʵ���㷨���õĶѽṹ��ʱ�临�Ӷ�ΪO(log2 n)

**15��Map**

- HashMap

  Ĭ������Ϊ16
  
  > put(K,V)������������HashMap������Ԫ��<br>
  >> 1 indexFor(int,int)�����������Ǹ���hashCode��table�����������±�
  
  >> 2 hash(Object k)���������ڼ����ֵK��hashCode
 
  >> 3 ����Entry��������������֣�<br>
      ��table[]�ﲻ����ָ���±꣬Ҳ����û�з�����ϣ��ײ <br>
      �� table[]�����ָ���±꣨������ϣ��ײ�������Ǽ�ֵ��ͬ��Ҳ������Entry���
  
  >> 4 addEntry(int, K, V,int)��createEntry(int,K,V,int)�����Ӽ�ֵ��
  
  >> 5 resize(int)�����ڸ�HashMap��������
  
  >> 6 transfer(Entry[], boolean),���¼���ת�Ƶ���table������Entry�±�
  
  >> 7 put�����ܽ�<br>
     �� �����ֵ��hashֵ<br>
     �� ����hashֵ��table����ȷ���±�<br>
     �� ��������<br>
     �� ����keyֵ��hashֵ���Աȣ�ȷ���Ǵ���������㻹�����֮ǰ������ֵ<br>
     �� �������Ӻ��size�����ݣ�ȷ����һ��������ֵ��ȷ���Ƿ���Ҫʹ�������ϣ�㷨
     
    JDK7��hashMap���� ����+���� �ṹ ������Entry���<br> 
    JDK8��hashMap���� ����+����+����� ������Node��� 


- TreeMap����Ҫ��������
  
  ��HashMap���������+����+����� ��ͬ��TreeMap����ȫ�ɺ����ʵ�ֵġ�<br>
  TreeMap��Ĭ�ϵ�����Ϊ�������Ҫ�ı�����������Լ�дһ��Comparator
  
- LinkedHashMap

   ```
   LinkedHashMap��HashMap���࣬�����˼�¼�Ĳ���˳��
   ����Iterator����LinkedHashMapʱ���ȵõ��ļ�¼�϶����Ȳ����.
   Ҳ�����ڹ���ʱ�ô�����������Ӧ�ô��������ڱ�����ʱ����HashMap����
   ��������������⣬��HashMap�����ܴ�ʵ�����ݽ���ʱ��
   �����������ܻ��LinkedHashMap������ΪLinkedHashMap�ı����ٶ�ֻ
   ��ʵ�������йأ��������޹أ���HashMap�ı����ٶȺ����������йء�
    ```

- HashTable��HashMap������
  ```
  1 HashTable���̰߳�ȫ��synchronized����   HashMap�̲߳���ȫ�����������ǰ��Ч�ʲ������
  2 �ڸ߲��������£������Ƽ�HashTable��ִ��Ч�ʽϵͣ�Java������ר�ŵĸ߲�������������
     ����������ʵ�ֵ�ʱ������˸���ϸ���ȵ������ڴ����������������Ÿ��õ����ܡ�

  ```

- WeekHashMap �� ��һ�������õ�HashMap��������ָ����WeekHashMap�е�keyֵ���
  û���ⲿǿ���ã���ô���������յ�ʱ��WeakHashMap�Ķ�Ӧ����Ҳ�ᱻ�Ƴ�����
  

**16��Set**

- HashSet���ڲ�����HashMapʵ�ֵģ�
- LinkedHashSet��ά�����ݲ����˳��
- TreeSet����������Ĭ�����򣬿���ͨ��Comparator�Զ�������

