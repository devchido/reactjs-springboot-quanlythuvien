package com.example.quanlythuvien.repository;

import com.example.quanlythuvien.domain.MuonTra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuonTraRepository extends JpaRepository<MuonTra, Integer> {
}