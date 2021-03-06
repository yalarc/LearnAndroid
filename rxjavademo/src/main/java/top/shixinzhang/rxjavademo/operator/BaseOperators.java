/*
 * Copyright (c) 2017. shixinzhang (shixinzhang2016@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package top.shixinzhang.rxjavademo.operator;

import rx.Subscriber;
import rx.functions.Action1;
import top.shixinzhang.rxjavademo.creator.SubscriberCreator;

/**
 * Description:
 * <br> 操作符测试基类，提供打印结果的订阅者
 * <p>
 * <br> Created by shixinzhang on 17/7/12.
 * <p>
 * <br> Email: shixinzhang2016@gmail.com
 * <p>
 * <br> https://about.me/shixinzhang
 */

public class BaseOperators {

    <T> Subscriber<T> getPrintSubscriber() {
        return SubscriberCreator.getPrintSubscriber();
    }

    <T> Subscriber<T> getBackpressureSubscriber() {
        return SubscriberCreator.getBackpressureSubscriber();
    }

    <T> Action1<T> getSleepAction1(long sleepTime) {
        return SubscriberCreator.getSleepAction1(sleepTime);
    }
}
