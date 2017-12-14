package com.mmall.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mmall.pojo.Cart;
import com.mmall.vo.CartVo;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);

    Cart selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);
    

	Cart selectCartByUserIdProductId(@Param("userId")Integer userId, @Param("productId")Integer productId);

	int deleteByUserIdProductIds(@Param("userId")Integer userId, @Param("productIdList")List<String> productIdList);

	int selectCartProductCheckedStatusByUserId(Integer userId);

	List<Cart> selectCartByUserId(Integer userId);

	Integer selectCartProductCount(Integer userId);

	int checkedOrUncheckedProduct(@Param("userId")Integer userId,@Param("productId")Integer productId, @Param("checked")Integer checked);

	List<Cart> selectCheckedCartByUserId(Integer userId);
}