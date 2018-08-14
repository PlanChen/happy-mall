package cn.happymall.modules.payment.service;

import cn.happymall.modules.payment.dto.PayRefundDetailDto;
import cn.happymall.modules.payment.dto.PayRefundDetailQueryBean;
import cn.happymall.modules.payment.vo.PayRefundDetailVo;

import java.util.List;
import java.util.Map;

/**
 * 交易退款记录表
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public interface PayRefundDetailService {

    PayRefundDetailVo queryObject(String id);

    List<PayRefundDetailVo> queryList(Map<String, Object> map);

    List<PayRefundDetailVo> queryList(PayRefundDetailQueryBean payRefundDetailQueryBean);

    int queryTotal(PayRefundDetailQueryBean payRefundDetailQueryBean);

    int queryTotal(Map<String, Object> map);

    PayRefundDetailVo save(PayRefundDetailDto payRefundDetailDto);

    PayRefundDetailVo update(PayRefundDetailDto payRefundDetailDto);

    void delete(String id);

    void deleteBatch(String[] ids);
}
