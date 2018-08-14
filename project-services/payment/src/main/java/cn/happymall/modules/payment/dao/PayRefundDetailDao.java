package cn.happymall.modules.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.happymall.modules.payment.dto.PayRefundDetailQueryBean;
import cn.happymall.modules.payment.entity.PayRefundDetailEntity;
import cn.happymall.modules.sys.dao.BaseDao;

import java.util.List;

/**
 * 交易退款记录表
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
@Mapper
public interface PayRefundDetailDao extends BaseDao<PayRefundDetailEntity> {
    List<PayRefundDetailEntity> queryListByDto(PayRefundDetailQueryBean payRefundDetailQueryBean);

    int queryTotalByDto(PayRefundDetailQueryBean payRefundDetailQueryBean);
}
