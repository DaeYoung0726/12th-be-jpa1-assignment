package com.example.blog.domain.follow.domain;

import com.example.blog.domain.BaseTimeEntity;
import com.example.blog.domain.user.domain.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class follow extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User follower;  // 추후에 관계매핑

    private User following;  // 추후에 관계매핑

    // 팔로우 설정
    public void setFollower(User follower) {
        this.follower = follower;
    }

    // 팔로잉 설정
    public void setFollowing(User following) {
        this.following = following;
    }
}