package com.codesoom.assignment.user.application;

import com.codesoom.assignment.user.dto.UserResponseDto;
import com.codesoom.assignment.user.dto.UserSaveRequestDto;
import com.codesoom.assignment.user.dto.UserUpdateRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 사용자 정보를 다룬다.
 */
@Service
@Transactional(readOnly = true)
public class UserService {

    public List<UserResponseDto> getUsers() {
        // TODO: 사용자의 목록을 리턴한다.
        return null;
    }

    public UserResponseDto getUser(Long userId) {
        // TODO: 사용자 정보를 리턴한다.
        return null;
    }

    @Transactional
    public UserResponseDto updateUser(long userId, UserUpdateRequestDto requestDto) {
        // TODO: 갱신된 사용자 정보를 리턴한다.
        return null;
    }

    @Transactional
    public UserResponseDto createUser(UserSaveRequestDto requestDto) {
        // TODO: 사용자 입력 정보를 저장하고 리턴한다.
        return null;
    }

    public Long deleteUser(Long id) {
        // TODO: 사용자 정보를 삭제한다.
        return null;
    }
}
