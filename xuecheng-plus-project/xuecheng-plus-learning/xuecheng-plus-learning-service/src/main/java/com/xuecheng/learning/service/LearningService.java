package com.xuecheng.learning.service;

import com.xuecheng.base.model.RestResponse;

/**
 * 在线学习相关接口
 */
public interface LearningService {
    /**
     * 获取教学视频
     * @param courseId 课程id
     * @param teachplanId 课程计划id
     * @param mediaId 视频文件id
     * @return
     */
    public RestResponse<String> getVideo(String userId, Long courseId, Long teachplanId, String mediaId);
}