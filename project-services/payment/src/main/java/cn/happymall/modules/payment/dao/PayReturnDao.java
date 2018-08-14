package cn.happymall.modules.payment.dao;

import org.apache.ibatis.annotations.Mapper;
import cn.happymall.modules.payment.dto.PayReturnQueryBean;
import cn.happymall.modules.payment.entity.PayReturnEntity;
import cn.happymall.modules.sys.dao.BaseDao;

import java.util.List;

/**
 * 支付异步通知日志
 * 
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
@Mapper
public interface PayReturnDao extends BaseDao<PayReturnEntity> {
    List<PayReturnEntity> queryListByDto(PayReturnQueryBean payReturnQueryBean);

    int queryTotalByDto(PayReturnQueryBean payReturnQueryBean);
}
