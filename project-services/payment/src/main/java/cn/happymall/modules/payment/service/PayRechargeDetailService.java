package cn.happymall.modules.payment.service;

import cn.happymall.modules.payment.dto.PayRechargeDetailDto;
import cn.happymall.modules.payment.dto.PayRechargeDetailQueryBean;
import cn.happymall.modules.payment.vo.PayRechargeDetailVo;

import java.util.List;
import java.util.Map;

/**
 * 交易记录表
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public interface PayRechargeDetailService {

    PayRechargeDetailVo queryObject(String id);

    List<PayRechargeDetailVo> queryList(Map<String, Object> map);

    List<PayRechargeDetailVo> queryList(PayRechargeDetailQueryBean payRechargeDetailQueryBean);

    int queryTotal(PayRechargeDetailQueryBean payRechargeDetailQueryBean);

    int queryTotal(Map<String, Object> map);

    PayRechargeDetailVo save(PayRechargeDetailDto payRechargeDetailDto);

    PayRechargeDetailVo update(PayRechargeDetailDto payRechargeDetailDto);

    void delete(String id);

    void deleteBatch(String[] ids);
}
