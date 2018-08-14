package cn.happymall.modules.payment.service;

import cn.happymall.modules.payment.dto.PayStatusNotificationDto;
import cn.happymall.modules.payment.dto.PayStatusNotificationQueryBean;
import cn.happymall.modules.payment.vo.PayStatusNotificationVo;

import java.util.List;
import java.util.Map;

/**
 * 支付状态推送日志
 *
 * @author Edward
 * @email edward@im219.com
 * @date 2017-11-19 15:28:09
 */
public interface PayStatusNotificationService {

    PayStatusNotificationVo queryObject(String id);

    List<PayStatusNotificationVo> queryList(Map<String, Object> map);

    List<PayStatusNotificationVo> queryList(PayStatusNotificationQueryBean payStatusNotificationQueryBean);

    int queryTotal(PayStatusNotificationQueryBean payStatusNotificationQueryBean);

    int queryTotal(Map<String, Object> map);

    PayStatusNotificationVo save(PayStatusNotificationDto payStatusNotificationDto);

    PayStatusNotificationVo update(PayStatusNotificationDto payStatusNotificationDto);

    void delete(String id);

    void deleteBatch(String[] ids);
}
