package lw

// See README.md for license details.

import chisel3._
import chisel3.experimental.BundleLiterals._
import chisel3.simulator.EphemeralSimulator._
import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.must.Matchers
import chisel3._
import common.Consts._
import _root_.circt.stage.ChiselStage

/**
  * This is a trivial example of how to run this Specification
  * From within sbt use:
  * {{{
  * testOnly gcd.GCDSpec
  * }}}
  * From a terminal shell use:
  * {{{
  * sbt 'testOnly gcd.GCDSpec'
  * }}}
  * Testing from mill:
  * {{{
  * mill SV32e.test.testOnly gcd.GCDSpec
  * }}}
  */
class CPUSpec extends AnyFreeSpec with Matchers {

  "Gcd should calculate proper greatest common denominator" in {
    simulate(new Top()) { dut =>


      dut.io.gp.peek()
      dut.io.exit.peek()
      dut.clock.step()

      dut.io.gp.peek()
      dut.io.exit.peek()
      dut.clock.step()

      dut.io.gp.peek()
      dut.io.exit.peek()
      dut.clock.step()

      dut.io.gp.peek()
      dut.io.exit.peek()
      dut.clock.step()
      
      dut.io.gp.peek()
      dut.io.exit.peek()
      dut.clock.step()


      }
    }
}
