package cn.happymall.modules.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.happymall.common.mapper.BeanMapper;
import cn.happymall.modules.payment.dao.PayReturnDao;
import cn.happymall.modules.payment.dto.PayReturnDto;
import cn.happymall.modules.payment.dto.PayReturnQueryBean;
import cn.happymall.modules.payment.entity.PayReturnEntity;
import cn.happymall.modules.payment.service.PayReturnService;
import cn.happymall.modules.payment.vo.PayReturnVo;

import java.util.List;
import java.util.Map;


@Service("payReturnService")
public class PayReturnServiceImpl implements PayReturnService {
    @Autowired
    private PayReturnDao payReturnDao;

    @Override
    public PayReturnVo queryObject(String id){
        PayReturnEntity payReturnEntity = payReturnDao.queryObject(id);
        return BeanMapper.map(payReturnEntity, PayReturnVo.class);
    }

    @Override
    public List<PayReturnVo> queryList(Map<String, Object> map){
        List<PayReturnEntity> payReturnList = payReturnDao.queryList(map);
        return BeanMapper.mapList(payReturnList, PayReturnEntity.class,  PayReturnVo.class);
    }

    @Override
    public List<PayReturnVo> queryList(PayReturnQueryBean payReturnQueryBean){
        List<PayReturnEntity> payReturnList = payReturnDao.queryListByDto(payReturnQueryBean);
        return BeanMapper.mapList(payReturnList, PayReturnEntity.class,  PayReturnVo.class);
    }


    @Override
    public int queryTotal(Map<String, Object> map){
        return payReturnDao.queryTotal(map);
    }

    @Override
    public int queryTotal(PayReturnQueryBean payReturnQueryBean){
        return payReturnDao.queryTotalByDto(payReturnQueryBean);
    }

    @Override
    public PayReturnVo save(PayReturnDto payReturnDto){
        PayReturnEntity payReturnEntity = BeanMapper.map(payReturnDto, PayReturnEntity.class);
        payReturnDao.save(payReturnEntity);
        return BeanMapper.map(payReturnEntity, PayReturnVo.class);
    }

    @Override
    public PayReturnVo update(PayReturnDto payReturnDto){
        PayReturnEntity payReturnEntity = BeanMapper.map(payReturnDto, PayReturnEntity.class);
        payReturnDao.update(payReturnEntity);
        return BeanMapper.map(payReturnEntity, PayReturnVo.class);
    }

    @Override
    public void delete(String id){
        payReturnDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids){
        payReturnDao.deleteBatch(ids);
    }

}