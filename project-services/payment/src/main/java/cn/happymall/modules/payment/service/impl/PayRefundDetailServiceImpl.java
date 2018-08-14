package cn.happymall.modules.payment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.happymall.common.mapper.BeanMapper;
import cn.happymall.modules.payment.dao.PayRefundDetailDao;
import cn.happymall.modules.payment.dto.PayRefundDetailDto;
import cn.happymall.modules.payment.dto.PayRefundDetailQueryBean;
import cn.happymall.modules.payment.entity.PayRefundDetailEntity;
import cn.happymall.modules.payment.service.PayRefundDetailService;
import cn.happymall.modules.payment.vo.PayRefundDetailVo;

import java.util.List;
import java.util.Map;


@Service("payRefundDetailService")
public class PayRefundDetailServiceImpl implements PayRefundDetailService {
    @Autowired
    private PayRefundDetailDao payRefundDetailDao;

    @Override
    public PayRefundDetailVo queryObject(String id){
        PayRefundDetailEntity payRefundDetailEntity = payRefundDetailDao.queryObject(id);
        return BeanMapper.map(payRefundDetailEntity, PayRefundDetailVo.class);
    }

    @Override
    public List<PayRefundDetailVo> queryList(Map<String, Object> map){
        List<PayRefundDetailEntity> payRefundDetailList = payRefundDetailDao.queryList(map);
        return BeanMapper.mapList(payRefundDetailList, PayRefundDetailEntity.class,  PayRefundDetailVo.class);
    }

    @Override
    public List<PayRefundDetailVo> queryList(PayRefundDetailQueryBean payRefundDetailQueryBean){
        List<PayRefundDetailEntity> payRefundDetailList = payRefundDetailDao.queryListByDto(payRefundDetailQueryBean);
        return BeanMapper.mapList(payRefundDetailList, PayRefundDetailEntity.class,  PayRefundDetailVo.class);
    }


    @Override
    public int queryTotal(Map<String, Object> map){
        return payRefundDetailDao.queryTotal(map);
    }

    @Override
    public int queryTotal(PayRefundDetailQueryBean payRefundDetailQueryBean){
        return payRefundDetailDao.queryTotalByDto(payRefundDetailQueryBean);
    }

    @Override
    public PayRefundDetailVo save(PayRefundDetailDto payRefundDetailDto){
        PayRefundDetailEntity payRefundDetailEntity = BeanMapper.map(payRefundDetailDto, PayRefundDetailEntity.class);
        payRefundDetailDao.save(payRefundDetailEntity);
        return BeanMapper.map(payRefundDetailEntity, PayRefundDetailVo.class);
    }

    @Override
    public PayRefundDetailVo update(PayRefundDetailDto payRefundDetailDto){
        PayRefundDetailEntity payRefundDetailEntity = BeanMapper.map(payRefundDetailDto, PayRefundDetailEntity.class);
        payRefundDetailDao.update(payRefundDetailEntity);
        return BeanMapper.map(payRefundDetailEntity, PayRefundDetailVo.class);
    }

    @Override
    public void delete(String id){
        payRefundDetailDao.delete(id);
    }

    @Override
    public void deleteBatch(String[] ids){
        payRefundDetailDao.deleteBatch(ids);
    }

}