package cn.happymall.modules.payment.service;

import cn.happymall.modules.payment.dto.PayReturnDto;
import cn.happymall.modules.payment.dto.PayReturnQueryBean;
import cn.happymall.modules.payment.vo.PayReturnVo;

import java.util.List;
import java.util.Map;

/**
 * 支付异步通知日志
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public interface PayReturnService {

    PayReturnVo queryObject(String id);

    List<PayReturnVo> queryList(Map<String, Object> map);

    List<PayReturnVo> queryList(PayReturnQueryBean payReturnQueryBean);

    int queryTotal(PayReturnQueryBean payReturnQueryBean);

    int queryTotal(Map<String, Object> map);

    PayReturnVo save(PayReturnDto payReturnDto);

    PayReturnVo update(PayReturnDto payReturnDto);

    void delete(String id);

    void deleteBatch(String[] ids);
}
