package cn.happymall.modules.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.happymall.common.mapper.BeanMapper;
import cn.happymall.modules.payment.dao.PayRechargeDetailDao;
import cn.happymall.modules.payment.dto.PayRechargeDetailDto;
import cn.happymall.modules.payment.dto.PayRechargeDetailQueryBean;
import cn.happymall.modules.payment.entity.PayRechargeDetailEntity;
import cn.happymall.modules.payment.service.PayRechargeDetailService;
import cn.happymall.modules.payment.vo.PayRechargeDetailVo;

import java.util.List;
import java.util.Map;


@Service("payRechargeDetailService")
public class PayRechargeDetailServiceImpl implements PayRechargeDetailService {
    @Autowired
    private PayRechargeDetailDao payRechargeDetailDao;

    @Override
    public PayRechargeDetailVo queryObject(String id){
        PayRechargeDetailEntity payRechargeDetailEntity = payRechargeDetailDao.queryObject(id);
        return BeanMapper.map(payRechargeDetailEntity, PayRechargeDetailVo.class);
    }

    @Override
    public List<PayRechargeDetailVo> queryList(Map<String, Object> map){
        List<PayRechargeDetailEntity> payRechargeDetailList = payRechargeDetailDao.queryList(map);
        return BeanMapper.mapList(payRechargeDetailList, PayRechargeDetailEntity.class,  PayRechargeDetailVo.class);
    }

    @Override
    public List<PayRechargeDetailVo> queryList(PayRechargeDetailQueryBean payRechargeDetailQueryBean){
        List<PayRechargeDetailEntity> payRechargeDetailList = payRechargeDetailDao.queryListByDto(payRechargeDetailQueryBean);
        return BeanMapper.mapList(payRechargeDetailList, PayRechargeDetailEntity.class,  PayRechargeDetailVo.class);
    }


    @Override
    public int queryTotal(Map<String, Object> map){
        return payRechargeDetailDao.queryTotal(map);
    }

    @Override
    public int queryTotal(PayRechargeDetailQueryBean payRechargeDetailQueryBean){
        return payRechargeDetailDao.queryTotalByDto(payRechargeDetailQueryBean);
    }

    @Override
    public PayRechargeDetailVo save(PayRechargeDetailDto payRechargeDetailDto){
        PayRechargeDetailEntity payRechargeDetailEntity = BeanMapper.map(payRechargeDetailDto, PayRechargeDetailEntity.class);
        payRechargeDetailDao.save(payRechargeDetailEntity);
        return BeanMapper.map(payRechargeDetailEntity, PayRechargeDetailVo.class);
    }

    @Override
    public PayRechargeDetailVo update(PayRechargeDetailDto payRechargeDetailDto){
        PayRechargeDetailEntity payRechargeDetailEntity = BeanMapper.map(payRechargeDetailDto, PayRechargeDetailEntity.class);
        payRechargeDetailDao.update(payRechargeDetailEntity);
        return BeanMapper.map(payRechargeDetailEntity, PayRechargeDetailVo.class);
    }

    @Override
    public void delete(String id){
        payRechargeDetailDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids){
        payRechargeDetailDao.deleteBatch(ids);
    }

}