package xgz.mybatis_props;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import xgz.mybatis_props.mapper.PropMapper;
import xgz.mybatis_props.model.Prop;
import xgz.mybatis_props.sevice.UpdatePropService;

public class MC 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//PropMapper pm=context.getBean(PropMapper.class);
    	/*Prop p=pm.selectByPrimaryKey("12");
        System.out.println(p.getPropRole());*/
    	/*UpdatePropService ups=context.getBean(UpdatePropService.class);
    	try {
			ups.doUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}*/
    	PropMapper pm=context.getBean(PropMapper.class);
    	//pm.deleteByPrimaryKey("8409636d-2e44-405e-9faf-035eabe7be71");
    	Prop p1=new Prop();
    	p1.setPropId("12");
    	p1.setPropRole("monster");
    	p1.setPropName("jack");
    	p1.setPropLevel("90");
    	pm.updateByPrimaryKeySelective(p1);
    	
    	
    }
}
