package xgz.mybatis_props.sevice;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import xgz.mybatis_props.mapper.PropMapper;
import xgz.mybatis_props.model.Prop;

@Component
public class UpdatePropService {
	@Autowired
	private PropMapper pm;
	@Transactional(rollbackFor=Exception.class)
	public void doUpdate() throws Exception{
		List<Prop> props=new ArrayList<Prop>();
		Prop p1=new Prop();
    	p1.setPropId(UUID.randomUUID().toString());
    	p1.setPropRole("h呼嚕娃");
    	p1.setPropName("大娃");
    	p1.setPropLevel("87");
    	props.add(p1);
    	
    	Prop p2=new Prop();
    	p2.setPropId(UUID.randomUUID().toString());
    	p2.setPropRole("呼嚕娃");
    	p2.setPropName("er娃");
    	p2.setPropLevel("89");
    	props.add(p2);
    	
    	for (int i = 0; i < props.size(); i++) {
    		pm.insert(props.get(i));
    		if(i==2) {
    			throw new Exception();
    		}
		}
		
		
		
	}
	
	

}
