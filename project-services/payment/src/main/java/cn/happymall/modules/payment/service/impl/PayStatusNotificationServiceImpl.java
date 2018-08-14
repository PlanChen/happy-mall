package cn.happymall.modules.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.happymall.common.mapper.BeanMapper;
import cn.happymall.modules.payment.dao.PayStatusNotificationDao;
import cn.happymall.modules.payment.dto.PayStatusNotificationDto;
import cn.happymall.modules.payment.dto.PayStatusNotificationQueryBean;
import cn.happymall.modules.payment.entity.PayStatusNotificationEntity;
import cn.happymall.modules.payment.service.PayStatusNotificationService;
import cn.happymall.modules.payment.vo.PayStatusNotificationVo;

import java.util.List;
import java.util.Map;


@Service("payStatusNotificationService")
public class PayStatusNotificationServiceImpl implements PayStatusNotificationService {
    @Autowired
    private PayStatusNotificationDao payStatusNotificationDao;

    @Override
    public PayStatusNotificationVo queryObject(String id){
        PayStatusNotificationEntity payStatusNotificationEntity = payStatusNotificationDao.queryObject(id);
        return BeanMapper.map(payStatusNotificationEntity, PayStatusNotificationVo.class);
    }

    @Override
    public List<PayStatusNotificationVo> queryList(Map<String, Object> map){
        List<PayStatusNotificationEntity> payStatusNotificationList = payStatusNotificationDao.queryList(map);
        return BeanMapper.mapList(payStatusNotificationList, PayStatusNotificationEntity.class,  PayStatusNotificationVo.class);
    }

    @Override
    public List<PayStatusNotificationVo> queryList(PayStatusNotificationQueryBean payStatusNotificationQueryBean){
        List<PayStatusNotificationEntity> payStatusNotificationList = payStatusNotificationDao.queryListByDto(payStatusNotificationQueryBean);
        return BeanMapper.mapList(payStatusNotificationList, PayStatusNotificationEntity.class,  PayStatusNotificationVo.class);
    }


    @Override
    public int queryTotal(Map<String, Object> map){
        return payStatusNotificationDao.queryTotal(map);
    }

    @Override
    public int queryTotal(PayStatusNotificationQueryBean payStatusNotificationQueryBean){
        return payStatusNotificationDao.queryTotalByDto(payStatusNotificationQueryBean);
    }

    @Override
    public PayStatusNotificationVo save(PayStatusNotificationDto payStatusNotificationDto){
        PayStatusNotificationEntity payStatusNotificationEntity = BeanMapper.map(payStatusNotificationDto, PayStatusNotificationEntity.class);
        payStatusNotificationDao.save(payStatusNotificationEntity);
        return BeanMapper.map(payStatusNotificationEntity, PayStatusNotificationVo.class);
    }

    @Override
    public PayStatusNotificationVo update(PayStatusNotificationDto payStatusNotificationDto){
        PayStatusNotificationEntity payStatusNotificationEntity = BeanMapper.map(payStatusNotificationDto, PayStatusNotificationEntity.class);
        payStatusNotificationDao.update(payStatusNotificationEntity);
        return BeanMapper.map(payStatusNotificationEntity, PayStatusNotificationVo.class);
    }

    @Override
    public void delete(String id){
        payStatusNotificationDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids){
        payStatusNotificationDao.deleteBatch(ids);
    }

}