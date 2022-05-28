
package com.example.application.service;

import com.example.application.model.Skill;
import com.example.application.repository.CommonRepository;
import com.example.application.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService extends CommonServiceImpl <Skill, Long> implements ISkillService {

 @Autowired
    private SkillRepository Skillrepo;
    
    public SkillService(CommonRepository <Skill, Long> commonRepository){
        
    super(commonRepository);
    }
    
}