package com.iandtop.jxy.util;

import com.iandtop.saas.smartpark.vo.SuperVO;
import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @andyzhao
 */
public class BaseUtils {
    public static <T extends SuperVO> List<T> mapToBean(Class<T> cls, List<Map> src) {
        try {
            List<T> result = new ArrayList<T>();
            for (Map map : src) {
                T vo = null;
                vo = cls.newInstance();
                BeanUtils.populate(vo, map);
                result.add(vo);
            }
            return result;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void listToTree(List<SuperVO> list,List<SuperVO> tree){
        for(SuperVO node1 : list){
            boolean mark = false;
            for(SuperVO node2 : list){
                if(node1.getParentPKField()!=null && node1.getParentPKField().equals(node2.getPKField())){
                    mark = true;
                    if(node2.getChildren() == null)
                        node2.setChildren(new ArrayList<SuperVO>());
                    node2.getChildren().add(node1);
                    break;
                }
            }
            if(!mark){
                tree.add(node1);
            }
        }
    }

    public static int increaseNum = 0;
    public static String getPK(){
        String sss = System.nanoTime()+"";
        int num = 15-sss.length();
        if(num>0){
            for(int i=0;i<num;i++){
                sss+="0";
            }
        }
        String pre = sss.substring(0,15);
        increaseNum++;
        if(increaseNum>9999){
            increaseNum = 0;
        }
        String numStr = increaseNum+"";
        String result = pre+"00000".substring(0,5-numStr.length())+numStr;
        return result;
    }
}
