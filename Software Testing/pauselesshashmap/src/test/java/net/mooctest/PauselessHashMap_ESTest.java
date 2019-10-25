/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 19 13:11:49 GMT 2019
 */

package net.mooctest;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

public class PauselessHashMap_ESTest {

    class Fruit {
        @Override
        public String toString() {
            return "fruit";
        }
    }

    class Apple extends Fruit {
        @Override
        public String toString() {
            return "apple";
        }
    }

    @Test(timeout = 4000)
    public void test00() throws Throwable {
        PauselessHashMap<String, String> pauselessHashMap0 = new PauselessHashMap<String, String>();
        PauselessHashMap<String, String> pauselessHashMap1 = new PauselessHashMap<String, String>(2554, 2554);
        try {
            PauselessHashMap<String, String> pauselessHashMap2 = new PauselessHashMap<String, String>(-1, 0);
            fail("Expecting exception IllegalArgumentException");
        } catch (Exception e) {

        }
        Map<Apple, Apple> mp = new HashMap<Apple, Apple>();
        PauselessHashMap<Fruit, Fruit> pauselessHashMap3 = new PauselessHashMap<Fruit, Fruit>(mp);
    }

    @Test(timeout = 4000)
    public void test01() throws Throwable {
        Class mClass = PauselessHashMap.class;
        System.out.println("类的名称：" + mClass.getName());
//        Field[] fields = mClass.getFields();

        //2.2 获取所有本类声明的变量（不问访问权限）
        Field[] fields = mClass.getDeclaredFields();

        //3. 遍历变量并输出变量信息
        for (Field field : fields) {
            //获取访问权限并输出
            int modifiers = field.getModifiers();
            System.out.print(Modifier.toString(modifiers) + " ");
            //输出变量的类型及变量名
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        Class[] classes = mClass.getDeclaredClasses();
        for (Class classs : classes) {
            System.out.println(classs.getName());
        }
    }

    public static Method getPrivateMethod(Class mClass, String methodName, Class ...params) throws NoSuchMethodException {
        Method privateMethod = mClass.getDeclaredMethod(methodName, params);
        privateMethod.setAccessible(true);
        return privateMethod;
    }
    public static Field getPrivateField(Class mClass, String fieldName) throws NoSuchFieldException {
        Field privateField = mClass.getDeclaredField(fieldName);
        if (privateField != null)
            privateField.setAccessible(true);
        return privateField;
    }
    public static Class[] getInnerClasses(Class mClass) {
        Class[] classes = mClass.getDeclaredClasses();
        return classes;
    }

    /*
    Test put
     */
    @Test(timeout = 4000)
    public void test12() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException, ClassNotFoundException, NoSuchFieldException {
        PauselessHashMap<String, String> pauselessHashMap0 = new PauselessHashMap<String, String>();
        pauselessHashMap0.containsKey(null);
        pauselessHashMap0.containsValue(null);
        pauselessHashMap0.containsKey("nmd");
        pauselessHashMap0.containsKey("wsm");
        pauselessHashMap0.containsValue("nmd");
        pauselessHashMap0.containsValue("wsm");
        pauselessHashMap0.put("a", "b");
        pauselessHashMap0.put(null, "b");
        pauselessHashMap0.put("a", "c");
        pauselessHashMap0.put("a", "b");
        pauselessHashMap0.put("b", "b");
        pauselessHashMap0.put("c", "b");
        pauselessHashMap0.put("d", "b");
        pauselessHashMap0.put("e", "b");
        pauselessHashMap0.put("f213234345", "b546456456");
        pauselessHashMap0.put("g", "b");
        pauselessHashMap0.put("h", "b");
        pauselessHashMap0.put("i", "b");
        pauselessHashMap0.put("j", "b");
        pauselessHashMap0.put("k", "b");
        pauselessHashMap0.put("l", "b");
        pauselessHashMap0.put("m", "b");

        Map<String, String> mp = new HashMap<String, String>();
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd1234234235", "wsm324234234");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");
        mp.put("nmd", "wsm");

        pauselessHashMap0.putAll(mp);

        pauselessHashMap0.rehash(101);

        pauselessHashMap0.forceFinishResizing();

        pauselessHashMap0.clear();
        pauselessHashMap0.clone();
        pauselessHashMap0.containsKey(null);
        pauselessHashMap0.containsValue(null);
        pauselessHashMap0.containsKey("nmd");
        pauselessHashMap0.containsKey("wsm");
        pauselessHashMap0.containsValue("nmd");
        pauselessHashMap0.containsValue("wsm");

        pauselessHashMap0.get(null);
        pauselessHashMap0.get("nmd");

        Method readObject = getPrivateMethod(PauselessHashMap.class, "readObject", ObjectInputStream.class);
//        readObject.invoke(pauselessHashMap0, new ObjectInputStream(new ByteArrayInputStream("233\0".getBytes())));
        List<Map> list = new ArrayList<>();
        list.add(pauselessHashMap0);
        list.add(mp);
        FileOutputStream fout = new FileOutputStream("student2.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(list);

        FileInputStream fin = new FileInputStream("student2.txt");
        ObjectInputStream in = new ObjectInputStream(fin);
        in.readObject();

        getPrivateMethod(PauselessHashMap.class, "writeObject", ObjectOutputStream.class);

        Field resizingIntoElementData = getPrivateField(PauselessHashMap.class, "resizingIntoElementData");

        PauselessHashMap.Entry<String, String>[] entries = pauselessHashMap0.newElementArray(3);

        resizingIntoElementData.set(pauselessHashMap0, entries);
        pauselessHashMap0.put("a", "b");
        pauselessHashMap0.put(null, "b");
        pauselessHashMap0.put("a", "c");
        pauselessHashMap0.put("a", "b");
        pauselessHashMap0.put("b", "b");
        pauselessHashMap0.put("c", "b");
        pauselessHashMap0.put("d", "b");
        pauselessHashMap0.put("e", "b");
        pauselessHashMap0.put("f213234345", "b546456456");
        pauselessHashMap0.put("g", "b");
        pauselessHashMap0.put("h", "b");
        pauselessHashMap0.put("i", "b");
        pauselessHashMap0.put("j", "b");
        pauselessHashMap0.put("k", "b");
        pauselessHashMap0.put("l", "b");

        PauselessHashMap.Entry<String, String> entry = pauselessHashMap0.createEntry("nmd", 0, "wsm");

        Field pendingResize = getPrivateField(PauselessHashMap.class, "pendingResize");
        pendingResize.set(pauselessHashMap0, true);
    }

    @Test(timeout = 4000)
    public void simpleTest() {
        PauselessHashMap<String, String> pauselessHashMap0 = new PauselessHashMap<String, String>();
        pauselessHashMap0.size();
        Collection<String> collection = pauselessHashMap0.values();
        collection.contains(null);
        collection.size();
        collection.clear();
        collection.iterator();
        pauselessHashMap0.computeHashCode("");

        pauselessHashMap0.areEqualKeys(null, null);
        pauselessHashMap0.areEqualValues(null, null);
        pauselessHashMap0.areEqualKeys(0, 1);
        pauselessHashMap0.areEqualValues(0, 1);
        pauselessHashMap0.areEqualKeys("nmd", "wsm");
        pauselessHashMap0.areEqualValues("nmd", "wsm");
    }

    public void testInnerResizer(Class _Resizer) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        PauselessHashMap<String, String> pauselessHashMap0 = new PauselessHashMap<String, String>(2);
        PauselessHashMap.Resizer resizer = pauselessHashMap0.new Resizer(pauselessHashMap0, 2, false);
        resizer.run();
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("a", "1"), 3);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("b", "2"), 2);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("c", "3"), 1);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("d", "4"), 0);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("e", "5"), 0);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("f", "6"), 1);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("g", "7"), 2);
        resizer.insertUniqueEquivalentAtHeadOfBucket(new PauselessHashMap.Entry<String, String>("h", "8"), 3);
    }

    @Test(timeout = 60000)
    public void testInnerClasses() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class[] classes = getInnerClasses(PauselessHashMap.class);
        for (Class _class : classes) {
            String className = _class.getName();
            System.out.println(className);
            if (className.equals("net.mooctest.PauselessHashMap$Resizer")) {
                testInnerResizer(_class);
            }
        }
    }

}
