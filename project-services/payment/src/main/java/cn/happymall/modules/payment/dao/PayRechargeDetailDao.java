package cn.happymall.modules.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.happymall.modules.payment.dto.PayRechargeDetailQueryBean;
import cn.happymall.modules.payment.entity.PayRechargeDetailEntity;
import cn.happymall.modules.sys.dao.BaseDao;

import java.util.List;

/**
 * 交易记录表
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
@Mapper
public interface PayRechargeDetailDao extends BaseDao<PayRechargeDetailEntity> {
    List<PayRechargeDetailEntity> queryListByDto(PayRechargeDetailQueryBean payRechargeDetailQueryBean);

    int queryTotalByDto(PayRechargeDetailQueryBean payRechargeDetailQueryBean);
}
